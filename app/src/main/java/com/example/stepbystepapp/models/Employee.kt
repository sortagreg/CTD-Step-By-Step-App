package com.example.stepbystepapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * 05 Create your data class.
 *
 * Ensure your data class matches the data(JSON, XML, HTML)
 * you receive, if you are connecting to an endpoint.
 *
 * This particular project does use an endpoint for it's data.
 * Samples of the JSON are in the readme package, in the
 * SampleJson.json file.
 *
 * @author Marshall Ladd
 */
// 05 This creates our class, and defines our constructor, all in one line
data class Employee(
        @Expose
        val id: Int,
        /**
         * 05 @SerializedName is used to tell the GSON library that
         * the variable name from the JSON, does not match what you have
         * named Kotlin variable.  In this case, the JSON field
         * employee_name is mapped to the Kotlin variable employeeName.
         *
         * Notice we did not need this line for the id variable.  This is
         * because name id in the Kotlin matches the JSON name exactly.
        */
        @SerializedName("employee_name")
        @Expose
        val employeeName: String,
        @SerializedName("employee_salary")
        @Expose
        val employeeSalary: Int,
        @SerializedName("employee_age")
        @Expose
        val employeeAge: Int,
        @SerializedName("profile_image")
        @Expose
        val profileImage: String)