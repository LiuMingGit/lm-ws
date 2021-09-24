package com.github.liuminggit.lmws.services

import com.intellij.openapi.project.Project
import com.github.liuminggit.lmws.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
