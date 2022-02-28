// This File is only to organize the application

// inport the Home component
import Home from "./pages/Home";
import Footer from "./components/Footer";
import Header from "./components/Header";

function App() {
  return (
    <>
     <Header /> {/* Another componet como from footer.jsx */}
      <Home />  {/* One page come from "Home.jsx" */}
      <Footer /> {/* One componet como from footer.jsx */}
    </>
  );
}

export default App;
