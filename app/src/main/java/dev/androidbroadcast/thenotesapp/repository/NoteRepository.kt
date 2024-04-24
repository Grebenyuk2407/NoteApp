package dev.androidbroadcast.thenotesapp.repository

import dev.androidbroadcast.thenotesapp.database.NoteDatabase
import dev.androidbroadcast.thenotesapp.model.Notes

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Notes)= db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Notes)= db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Notes)= db.getNoteDao().updateNote(note)

    fun getAllNotes()= db.getNoteDao().getAllNotes()

    fun searchNote(query:String?)= db.getNoteDao().searchNote(query)
}