import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">

      <CalculateScore
        Name="Piyush Pachauri"
        School="GLA University"
        Total={480}
        goal={6}
      />

    </div>
  );
}

export default App;