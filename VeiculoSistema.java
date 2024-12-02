// Classe base para Veículos
abstract class Veiculo {
    private String modelo;
    private int anoFabricacao;

    // Construtor que inicializa modelo e ano de fabricação
    public Veiculo(String modelo, int anoFabricacao) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("Ano de fabricação deve ser positivo.");
        }
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Métodos getters
    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Método abstrato para gerar comando SQL INSERT
    public abstract String generateInsertQuery();
}

// Classe Automóvel
class Automovel extends Veiculo {
    private int qtdPassageiros;
    private String tipoFreio;
    private boolean possuiAirbag;

    // Construtor que inicializa todos os atributos
    public Automovel(String modelo, int anoFabricacao, int qtdPassageiros, String tipoFreio, boolean possuiAirbag) {
        super(modelo, anoFabricacao);
        if (qtdPassageiros <= 0) {
            throw new IllegalArgumentException("Quantidade de passageiros deve ser positiva.");
        }
        if (tipoFreio == null || tipoFreio.isEmpty()) {
            throw new IllegalArgumentException("Tipo de freio é obrigatório.");
        }
        this.qtdPassageiros = qtdPassageiros;
        this.tipoFreio = tipoFreio;
        this.possuiAirbag = possuiAirbag;
    }

    // Métodos getters
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public boolean isPossuiAirbag() {
        return possuiAirbag;
    }

    // Implementação do método para gerar comando SQL INSERT
    @Override
    public String generateInsertQuery() {
        return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, qtd_passageiros, tipo_freio, possui_airbag) VALUES ('%s', %d, %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), qtdPassageiros, tipoFreio, possuiAirbag);
    }
}

// Classe Motocicleta
class Motocicleta extends Veiculo {
    private int cilindrada;
    private double torque;

    // Construtor que inicializa todos os atributos
    public Motocicleta(String modelo, int anoFabricacao, int cilindrada, double torque) {
        super(modelo, anoFabricacao);
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("Cilindrada deve ser positiva.");
        }
        if (torque <= 0) {
            throw new IllegalArgumentException("Torque deve ser positivo.");
        }
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    // Métodos getters
    public int getCilindrada() {
        return cilindrada;
    }

    public double getTorque() {
        return torque;
    }

    // Implementação do método para gerar comando SQL INSERT
    @Override
    public String generateInsertQuery() {
        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, cilindrada, torque) VALUES ('%s', %d, %d, %.2f);",
                getModelo(), getAnoFabricacao(), cilindrada, torque);
    }
}

// Classe Caminhão
class Caminhao extends Veiculo {
    private int qtdEixos;
    private double pesoBruto;

    // Construtor que inicializa todos os atributos
    public Caminhao(String modelo, int anoFabricacao, int qtdEixos, double pesoBruto) {
        super(modelo, anoFabricacao);
        if (qtdEixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser positiva.");
        }
        if (pesoBruto <= 0) {
            throw new IllegalArgumentException("Peso bruto deve ser positivo.");
        }
        this.qtdEixos = qtdEixos;
        this.pesoBruto = pesoBruto;
    }

    // Métodos getters
    public int getQtdEixos() {
        return qtdEixos;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    // Implementação do método para gerar comando SQL INSERT
    @Override
    public String generateInsertQuery() {
        return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, qtd_eixos, peso_bruto) VALUES ('%s', %d, %d, %.2f);",
                getModelo(), get
::contentReference[oaicite:0]{index=0}
 
