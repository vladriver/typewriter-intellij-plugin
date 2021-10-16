package com.github.vladriver.typewriterintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.vladriver.typewriterintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
