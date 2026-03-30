import { useEffect, useState } from "react";
import "./App.css";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch(`${process.env.REACT_APP_API_URL}/test`)
      .then(res => res.json())
      .then(data => setMessage(data.message))
      .catch(() => setMessage("Error connecting backend"));
  }, []);

  return (
    <div className="App">
      <h1>Full Stack App</h1>
      <h2>{message}</h2>
    </div>
  );
}

export default App;