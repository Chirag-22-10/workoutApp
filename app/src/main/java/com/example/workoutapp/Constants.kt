package com.example.workoutapp

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumpingjacks,
            false,
            false

        )
        exerciseList.add(jumpingJacks)
        val pushUps = ExerciseModel(
            2,
            "Push Ups",
            R.drawable.pushups,
            false,
            false

        )
        exerciseList.add(pushUps)


        return exerciseList
    }
}