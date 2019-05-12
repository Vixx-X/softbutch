import java.util.HashMap;
import java.util.Map;

class Field {
	public static Map<String, String> codeDesc = createMap();

	public static Map<String, String> createMap() {
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put("IS1", "Arquitectura de software");
		tmp.put("IS2", "Educación y capacitación en Ingenieria de Software");
		tmp.put("IS3", "Evaluación de procesos y productos");
		tmp.put("IS4", "Ingeniería de Software");
		tmp.put("IS5", "Métodos ágiles");
		tmp.put("IS6", "Métricas y mediciones de software");
		tmp.put("IS7", "Procesos de software, métodos y herramientas");
		tmp.put("IS8", "Reutilización de software");
		tmp.put("IS9", "Otra");

		return tmp;
	}
}
