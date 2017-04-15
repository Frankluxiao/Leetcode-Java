bool isPowerOfThree(int n) {
    int num = 1;
    for(int i = 0; i < 20; i++) {
        if(num == n) return true;
        num *= 3;
    }
    return false;
}
