export default function retornoImbutido() {
    const subtitulo = "Tamo aí no JS!" // string atribuida aqui

    return (
        <div>
            <h1>Integração JS e JSX</h1>
            {/* Javascript chamada aqui */}
            <h2>{subtitulo}</h2>
            <h2>3 X 3 = {3 * 3}</h2>
            <h2>{Math.max(11, 25)}</h2>
            {/* Javascript chamada aqui */}
        </div>
    )
}