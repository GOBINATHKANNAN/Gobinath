class Manage {
    public static class Vehi2 {
        private String brand;
        private String model;

        public Vehi2(String brand,String model) {
            this.brand = brand;
            this.model = model;
        }
        public Vehi2() {
        }
        public void prt() {
            System.out.print(brand + "\t");
        }
        public void model() {
            System.out.print(model);
        }
    }
}
