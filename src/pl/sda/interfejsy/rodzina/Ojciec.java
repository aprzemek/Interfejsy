package pl.sda.interfejsy.rodzina;

    public class Ojciec implements ICzlonekRodziny {
        public static void main(String[] args) {

            Ojciec ojciec = new Ojciec();
            ojciec.przedstawSie();
            ojciec.jestDorosly();
        }
            @Override
            public void przedstawSie () {
                System.out.println("im your father");

            }

        @Override
        public boolean jestDorosly() {
            System.out.println();
            return true;

        }
    }
