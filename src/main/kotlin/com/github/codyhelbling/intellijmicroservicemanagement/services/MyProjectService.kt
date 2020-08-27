package com.github.codyhelbling.intellijmicroservicemanagement.services

import com.intellij.openapi.project.Project
import com.github.codyhelbling.intellijmicroservicemanagement.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
