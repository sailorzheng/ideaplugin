package com.github.sailorzheng.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.sailorzheng.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
