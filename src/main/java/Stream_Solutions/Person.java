package Stream_Solutions;

public class Person {

        private int id;
        private String name;
        private String surname;
        private String job;
        private int age;
        private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

        public Person() {
            super();
        }

        public Person(int id, String name, String surname, String job, int age, String nationality) {
            super();
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.job = job;
            this.age = age;
            this.nationality = nationality;
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

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
