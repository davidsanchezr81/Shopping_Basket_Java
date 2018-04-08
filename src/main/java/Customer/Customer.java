package Customer;

public class Customer {

        private String name;
        private boolean isLoyal;

        public Customer(String name, boolean isLoyal) {
            this.name = name;
            this.isLoyal = isLoyal;
        }

        public String getName() { return name; }

        public boolean isLoyal() { return isLoyal; }

    }

