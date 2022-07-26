package com.github.yuhaibo19891112.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.yuhaibo19891112.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
