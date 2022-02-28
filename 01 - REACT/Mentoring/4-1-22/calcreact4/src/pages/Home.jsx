import './style.css';
import Header from '../components/Header';
import Footer from '../components/Footer';

export default function Home() {
    return (
        <main style={styleMain.main}> {/* Call the variable styleMain */}

            <Header title="Calculator Recode Pro 003"/> {/* This is called from "Header.jsx"  component */}

            <section className="container">
                <div className="p-4">
                    <form>
                        <div className="form-group">
                            <label htmlFor="valor1">Digite o primeiro valor:</label>
                            <input
                                type="number"
                                className="form-control"
                                id="valor1"
                                placeholder="Exemplo: 1"
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="operador">Digite um operador válido:</label>
                            <input
                                type="text"
                                className="form-control"
                                id="operador"
                                placeholder="Exemplo: +, -, * ou /."
                            />
                        </div>
                        <div className="form-group">
                            <label htmlFor="valor2">Digite o segundo valor:</label>
                            <input
                                type="number"
                                className="form-control"
                                id="valor2"
                                placeholder="Exemplo: 2"
                            />
                        </div>
                        <button type="submit" className="btn btn-primary" id="buttonSomar">
                            Calcular
                        </button>
                    </form>
                </div>
                <div id="res" className="p-4"></div>
            </section>
            <Footer /> {/* This is called from "Footer.jsx"  component */}
        </main>
    )
}

// Create a object style
const styleMain = {
    main: {
        height: '100vh',
        position: 'relative',
        backgroundColor: '#27292b',
        color: '#fff',
      } 
}