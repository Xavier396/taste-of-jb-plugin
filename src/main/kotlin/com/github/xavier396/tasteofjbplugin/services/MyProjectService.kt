package com.github.xavier396.tasteofjbplugin.services

import com.intellij.openapi.project.Project
import com.github.xavier396.tasteofjbplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
