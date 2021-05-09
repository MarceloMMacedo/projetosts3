
import axios from 'axios';
import { SaleSum } from 'components/types/sele';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts'
import { BASE_URL } from 'utils/requests';

type _ChartData = {
  _labels: any[];
  series: any[];
}

function DonutChart() {
  //FORMA TEMPORÁRIO 
  const [chartData, setChatData] = useState<_ChartData>({ _labels: [], series: [] });

  useEffect(() => {
    axios.get<SaleSum[]>(`${BASE_URL}/sales/amount-by-seller`)
      .then(resp => {
        const myLabels = resp.data.map(x => x.sellerName);
        const mySeries = resp.data.map(x => x.sum);
        setChatData({
          _labels: myLabels,
          series: mySeries
        });
      })

  }, []);


  /* const mockData = {
     series: [477138, 499928, 444867, 220426, 473088],
     labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
   }
 */
  const options = {
    legend: {
      show: true
    }
  }

  console.log(chartData);
  return (


    <Chart
      options={{ ...options, labels: chartData._labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
}

export default DonutChart;
