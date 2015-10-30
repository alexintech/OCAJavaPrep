class A {
  // error: recursive constructor invocation
  A() {
    this("foo");
  }
  A(String s) {
    this();
  }
}
