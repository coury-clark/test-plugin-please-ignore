package com.github.couryclark.testpluginpleaseignore.services

import com.github.couryclark.testpluginpleaseignore.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
