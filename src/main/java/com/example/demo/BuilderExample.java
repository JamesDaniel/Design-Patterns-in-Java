package com.example.demo;

public class BuilderExample {

    public static class Builder {
        private String one;
        private String two;
        private String three;

        public Builder() {

        }

        public BuilderExample build() {
            return new BuilderExample(this);
        }

        public Builder one(String one) {
            this.one = one;
            return this;
        }

        public Builder two(String two) {
            this.two = two;
            return this;
        }

        public Builder three(String three) {
            this.three = three;
            return this;
        }
    }

    private String one;
    private String two;
    private String three;

    public BuilderExample(Builder builder) {
        this.one = builder.one;
        this.two = builder.two;
        this.three = builder.three;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }
}
