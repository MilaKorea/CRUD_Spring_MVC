package com.web.model;



import javax.persistence.*;


    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // автоинкремент
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "lastName")
        private String lastName;

        @Column(name = "age")

        private int age;

        public User() {
        }

        public User(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


