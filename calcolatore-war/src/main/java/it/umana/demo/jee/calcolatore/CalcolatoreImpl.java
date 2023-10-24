package it.umana.demo.jee.calcolatore;


import javax.jws.WebService;

@WebService
public class CalcolatoreImpl implements ICalcolatore {
    @Override
    public SommaResponse somma(SommaRequest sommaRequest) {
        var response = new SommaResponse();
        response.setTestataTecnica(sommaRequest.getTestataTecnica());
        try{
            var somma = sommaRequest.getAddendo()
                    .stream()
                    .reduce(0, Integer::sum);

            response.setSomma(somma);
            response.setEsito("OK");
        }catch (Exception e){
            response.setEsito("Errore");
            response.setEsito("Errore");
        }

        return response;
    }

    @Override
    public SottraiResponse sottrai(SottraiRequest sottraiRequest) {
        var response = new SottraiResponse();
        response.setTestataTecnica(sottraiRequest.getTestataTecnica());
        try{
            var differenza = sottraiRequest.getSottraendo()
                    .stream()
                    .reduce(sottraiRequest.getMinuendo(), (a,b)-> a-b);

            response.setDifferenza(differenza);
            response.setEsito("OK");
        }catch (Exception e){
            response.setEsito("Errore");
            response.setEsito("Errore");
        }

        return response;
    }

    @Override
    public MoltiplicaResponse moltiplica(MoltiplicaRequest moltiplicaRequest) {
        var response = new MoltiplicaResponse();
        response.setTestataTecnica(moltiplicaRequest.getTestataTecnica());
        try{
            var prodotto = moltiplicaRequest.getFattore()
                    .stream()
                    .reduce(1, (a,b)-> a*b);

            response.setProdotto(prodotto);
            response.setEsito("OK");
        }catch (Exception e){
            response.setEsito("Errore");
            response.setEsito("Errore");
        }

        return response;
    }
}
