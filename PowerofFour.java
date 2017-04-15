public boolean isPowerOfFour(int num) {
    if(num < 1) return false;
    int n = 1;
    for(int i = 0; i < 17; i++) {
    if(n == num) return true;
    n *= 4;
    }
    return false;
}
