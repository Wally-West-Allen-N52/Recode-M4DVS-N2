
export default function Footer() {
    return (
        <footer style={styleFooter.Footer}> {/* Call the variable styleFooter */}
            <img
            style={styleFooter.img} // Call the variable styleFooter.img
                src="https://recodepro.org.br/wp-content/uploads/2022/01/recode_pro-logo-1.svg"
                alt="recodePro"
            />
        </footer>
    )
}

// Create a object style
const styleFooter = {
    footer: {
        position: 'absolute',
        bottom: '0px',
        padding: '20px',
        width: '100%',
        textAlign: 'center',
        backgroundColor: '#363b3d',
    },
    img: {
        height: '30px',
    }
}