package com.github.henryju.reproducerintellijpluginprotobuf.services

import com.intellij.openapi.project.Project
import com.github.henryju.reproducerintellijpluginprotobuf.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
