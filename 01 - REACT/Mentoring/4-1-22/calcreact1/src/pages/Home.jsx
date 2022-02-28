// import the "style.css"
import './style.css';


// Export function to dd File
export default function Home() {
    return (
        <main>

            <section className="container">
                <div className="p-4">
                    <htmlForm>
                        <div className="htmlForm-group">
                            <label htmlFor="valor1">Digite o primeiro valor:</label>
                            <input
                                type="number"
                                className="htmlForm-control"
                                id="valor1"
                                placeholder="Exemplo: 1"
                            />
                        </div>
                        <div className="htmlForm-group">
                            <label htmlFor="operador">Digite um operador válido:</label>
                            <input
                                type="text"
                                className="htmlForm-control"
                                id="operador"
                                placeholder="Exemplo: +, -, * ou /."
                            />
                        </div>
                        <div className="htmlForm-group">
                            <label htmlFor="valor2">Digite o segundo valor:</label>
                            <input
                                type="number"
                                className="htmlForm-control"
                                id="valor2"
                                placeholder="Exemplo: 2"
                            />
                        </div>
                        <button type="submit" className="btn btn-primary" id="buttonSomar">
                            Calcular
                        </button>
                    </htmlForm>
                </div>
                <div id="res" className="p-4"></div>
            </section>

        </main>
    );
}