class Clothing {
  Clothing(String s) { }
}

// Compiler adds default constructor
// Clothing() { super(); }
//
// But there is no no-args constructor in base class
class TShirt extends Clothing { }
