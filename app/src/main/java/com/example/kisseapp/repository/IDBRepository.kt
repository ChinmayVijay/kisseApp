package com.example.kisseapp.repository

interface IDBRepository<T>: IRepository {
    suspend fun insert(modelObject:T)
    suspend fun update(modelObject:T)
    suspend fun delete(modelObject:T)
    suspend fun getAll(): List<T>
    suspend fun getById(id: Int): T
}