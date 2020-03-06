public class Account {

        private float balance;
        private float minimumBalance = 10.00F;

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public float getMinimumBalance() {
            return minimumBalance;
        }

        public void setMinimumBalance(float minimumBalance) {
            this.minimumBalance = minimumBalance;
        }
}
