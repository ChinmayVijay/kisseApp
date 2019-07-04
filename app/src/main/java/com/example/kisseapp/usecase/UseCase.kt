package com.example.kisseapp.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

suspend operator fun <R> UseCase<Unit,R>.invoke(): LiveData<Result<R>> = this(Unit)

suspend operator fun <R> UseCase<Unit,R>.invoke(result: MutableLiveData<Result<R>>) = this(Unit,result)

abstract class UseCase<in P, R> {
    abstract suspend fun execute(request:P): R

    suspend fun executeSync(request: P):Result<R>{
        return try{
            Result.success(execute(request))
        } catch (e: Exception){
            Result.failure(e)
        }
    }

    suspend operator fun invoke(request:P, result: MutableLiveData<Result<R>>){
        try{
            execute(request).let { useCaseResult ->
                result.postValue(Result.success(useCaseResult))
            }
        } catch (e: Exception){
            result.postValue(Result.failure(e))
        }
    }

    suspend operator fun invoke(request: P): LiveData<Result<R>> {
        val liveData = MutableLiveData<Result<R>>()
        this(request,liveData)
        return liveData
    }
}

