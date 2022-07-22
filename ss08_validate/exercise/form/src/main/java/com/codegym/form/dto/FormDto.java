package com.codegym.form.dto;

import javax.validation.constraints.*;

public class FormDto {
    private int id;
    @NotBlank
    @Size(min = 2,max = 45)
    private String name;
    @NotBlank
    @Pattern(regexp ="^09|07\\d{8}$")
    private String phone;
    @NotBlank
    @Min(18)
    private String age;
    @NotBlank
    @Email()
    private String email;

    public FormDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
