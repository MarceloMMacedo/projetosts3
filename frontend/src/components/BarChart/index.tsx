import axios from 'axios';
import { SaleSuccess } from 'components/types/sele';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts'
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';
function BarChart() {
  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      }
    },
  };

  type seriesDta =
    {
      name: any;
      data: number[];
    }
    ;

  type ChartData = {
    labels: {
      categories: any[];

    };
    series: seriesDta[];
  }

  const [chartData, setChatData] = useState<ChartData>({
    labels: {
      categories: []
    },
    series: []
  });

  useEffect(() => {
    axios.get<SaleSuccess[]>(`${BASE_URL}/sales/success-by-seller`)
      .then(resp => {
        const myLabels = resp.data.map(x => x.sellerName);
        const mySeries = resp.data.map(x => round(100 * x.deals / x.visited, 1)); 

        setChatData({
          labels: {
            categories: myLabels

          },
          series: [{
            name: "% Sucesso",
            data: mySeries
          }],

        })
      }) 
    } , []);


  /*const chartData = {
    labels: {
      categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    },
    series: [
      {
        name: "% Sucesso",
        data: [43.6, 67.1, 67.7, 45.6, 71.1]
      }
    ]
  };*/
  return (
    <Chart
      options={{ ...options, xaxis: chartData.labels }}
      series={chartData.series}
      type="bar"
      height="240"
    />
  );
}

export default BarChart;
