package com.kevin.simplecrud.Pegawai

class ApiEndPointPegawai {
    companion object {

        private val SERVER = "https://admincrud.000webhostapp.com/pegawai/"
        val CREATE = SERVER + "create.php"
        val READ = SERVER + "read.php"
        val DELETE = SERVER + "delete.php"
        val UPDATE = SERVER + "update.php"

    }
}