package com.example.appdatabaseinsert.roomDB

import androidx.room.Database

@Database(
    entities = [Pessoa::class],
    version = 1
)

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao() : PessoaDao
}



