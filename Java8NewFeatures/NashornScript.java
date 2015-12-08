import javax.script.*;

public class NashornScript {
  public static void main(String[] args) {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("nashorn");

    String script = "var welcome = 'Hello'; "
        + "welcome += ', Alex'; "
        + "welcome;";

    String result;
    try {
      result = (String)engine.eval(script);
      System.out.println(result);
    } catch (ScriptException e) {
      System.out.println("There was a JavaScript error");
      e.printStackTrace();
    }
  }
}

