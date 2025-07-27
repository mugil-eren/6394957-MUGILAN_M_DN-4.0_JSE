import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  const cohorts = [
    { name: 'React Bootcamp', duration: '6 weeks', status: 'ongoing' },
    { name: 'Spring Framework Mastery', duration: '4 weeks', status: 'completed' },
    { name: 'Node.js Essentials', duration: '5 weeks', status: 'completed' },
    { name: 'Advanced CSS', duration: '3 weeks', status: 'ongoing' }
  ];

  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1>My Academy - Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          name={cohort.name}
          duration={cohort.duration}
          status={cohort.status}
        />
      ))}
    </div>
  );
}

export default App;
