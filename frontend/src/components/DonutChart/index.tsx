
import axios from 'axios';
import { SaleSum } from 'components/types/sele';
import Chart from 'react-apexcharts'
import { BASE_URL } from 'utils/requests';

type ChartDat = {
  labels: any[] ;
  series: any[];
}

function DonutChart() {
  //FORMA TEMPORÁRIO
  let chartData: ChartDat = { labels: [], series: [] };

  axios.get<SaleSum[]>(`${BASE_URL}/sales/amount-by-seller`)
    .then(resp => { 
      const myLabels = resp.data.map(x => x.sellerName) ;
      const mySeries = resp.data.map(x => x.sum);
   
      chartData={labels:myLabels,series:mySeries};
      
     // chartData = { labels: myLabels, series: mySeries };
    }
    );

  const mockData = {
    series: [477138, 499928, 444867, 220426, 473088],
    labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
  }

  const options = {
    legend: {
      show: true
    }
  }

  console.log(chartData);
  return (

    
    <Chart
      options={{ ...options, labels: mockData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
}

export default DonutChart;
