import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <>
            <div >
                <NavBar />
                <div className="container">
                    <h1 className="text-primary px-3">DashBord Vendas</h1>

                    <div className="row px-3">
                        <div className="col-sm-6">
                            <h5 className="text-secondary text-center">Taxa Sucesso(%5)</h5>

                            <BarChart />
                        </div>

                        <div className="col-sm-6">
                            <h5 className="text-secondary text-center">Vendas</h5>

                            <DonutChart />
                        </div>
                        <div  >
                            <h2 className="text-primary px-3">Todas as Vendas</h2>

                        </div>
                        <DataTable />
                    </div>


                </div>


            </div>
            <Footer />
        </>
    );
}

export default Dashboard;
