import javax.script.*;
import java.io.*;

public class NashornScriptFile {
  public static void main(String[] args) throws FileNotFoundException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("nashorn");

    File f = new File("scripts/readurl.js");
    Reader reader = new FileReader(f);

    String result;
    try {
      result = (String)engine.eval(reader);
      System.out.println(result);
    } catch (ScriptException e) {
      System.out.println("There was a JavaScript error");
      e.printStackTrace();
    }
  }
}

