enum March {LEFT, RIGHT}
public class Defence {
  enum March {LEFT, RIGHT}
  static enum Military {
    INFANTRY, AIRFORCE;
    enum March {LEFT, RIGHT}
  }

  class Secret {
    // error: enum declarations allowed only in static contexts
    //! enum March {LEFT, RIGHT}
  }

  static class Open {
    enum March {LEFT, RIGHT}
  }
  public static void declareWar() {
    //! enum March {LEFT, RIGHT} // enum types must not be local
  }
  public void declarePeace() {
    //! enum March {LEFT, RIGHT} // enum types must not be local
  }
}
