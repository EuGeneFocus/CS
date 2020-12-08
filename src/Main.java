class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("there!");
        showBuilder(builder);
    }

    private static void showBuilder(StringBuilder builder) {
        System.out.println(builder.toString());
    }
}