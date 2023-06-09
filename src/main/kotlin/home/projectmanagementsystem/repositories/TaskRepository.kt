package home.projectmanagementsystem.repositories

import home.projectmanagementsystem.models.Task
import org.springframework.data.mongodb.repository.MongoRepository

interface TaskRepository : MongoRepository<Task, String> {
    fun findTaskByIdAndProjectId(taskId: String, projectId: String): Task?
    fun findTasksByProjectId(projectId: String?): MutableList<Task>
    fun findTasksByCreatedBy(userId: String): MutableList<Task>
}