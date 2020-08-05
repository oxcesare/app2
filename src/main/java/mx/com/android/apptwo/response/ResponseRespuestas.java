package mx.com.android.apptwo.response;

public class ResponseRespuestas {
	
	
	private Integer numeroRespuesta;
	private String  respuesta;
	private Integer correcta; //1 for correct, 0 for incorrect
	private Integer idPregunta;
	private String  pregunta;
	
	public Integer getNumeroRespuesta() {
		return numeroRespuesta;
	}
	public void setNumeroRespuesta(Integer numeroRespuesta) {
		this.numeroRespuesta = numeroRespuesta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Integer getCorrecta() {
		return correcta;
	}
	public void setCorrecta(Integer correcta) {
		this.correcta = correcta;
	}
	public Integer getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	
	
	
	
	

}
