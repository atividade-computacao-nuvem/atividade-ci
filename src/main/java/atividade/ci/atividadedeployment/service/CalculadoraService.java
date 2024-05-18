package atividade.ci.atividadedeployment.service;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

@Service
public class CalculadoraService {

    public double dividir(double a, double b) {
        if (b == 0) {
        throw new HttpStatusCodeException(HttpStatusCode.valueOf(400), "Divisão por zero") {
            @Override
            public int getRawStatusCode() {
                return 400;
            }

            @Override
            public String getStatusText() {
                return "Divisão por zero";
            }

            @Override
            public String getResponseBodyAsString() {
                return "Divisão por zero";
            }
        };

        }
        return a / b;
    }
}
