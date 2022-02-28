
export default function Header() {
    return (
        <header style={style.header}> {/* Call the variable style */}
            <h1>Calculator Recode Pro 002</h1>
        </header>
    );
}


// Arroow function sast "edf" 
// export default (params) => {

// }

// Create a object style
const style = {
    header: {
        height: '150px',
        background: '#fd8d33',
        padding: '30px',
        display: 'flex',
        alignItems: 'flex-end',
    }
}