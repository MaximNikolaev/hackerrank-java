// https://www.hackerrank.com/challenges/java-static-initializer-block

static int[] arr = initializeVariables();
static int B = arr[0];
static int H = arr[1];

static boolean flag = !(B <= 0||H <= 0);

private static int[] initializeVariables() {

    int[] arr = new int[2];
    Scanner sc = Scanner(System.in);
    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    sc.close();

    if(arr[0] <=0 || arr[1] <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    return arr;

}
