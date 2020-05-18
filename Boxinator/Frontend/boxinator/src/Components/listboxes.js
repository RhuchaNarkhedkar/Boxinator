import React, { Component } from 'react';
import { connect } from 'react-redux';

class BoxList extends Component {

    shippingCost_Calc = (country, weight) => {
        var shippingCost;
        switch (country) {
            case 'Sweden':
                shippingCost = (1.3 * weight).toFixed(2);
                return shippingCost;
            case 'China':
                shippingCost = (4.0 * weight).toFixed(2);
                return shippingCost;
            case 'Brazil':
                shippingCost = (8.6 * weight).toFixed(2);
                return shippingCost;

            case 'Australia':
                shippingCost = (7.2 * weight).toFixed(2);
                return shippingCost;
            default:
                break;
        }
    }

    render() {
        return (
            <div className="list-box-container">
                <h1>List boxes</h1>

                <table>
                    <thead>
                        <tr>
                            <th>Receiver</th>
                            <th>Weight</th>
                            <th>Box colour</th>
                            <th>Shipping cost</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.props.boxes.map((box) => {

                            return (
                                <tr key={box.id}>
                                    <td>{box.name}</td>
                                    <td>{box.weight} kilogram(s)</td>
                                    <td style = {{backgroundColor: box.color}}></td>
                                    <td>{this.shippingCost_Calc(box.country, box.weight)} SEK</td>
                                </tr>
                            );
                        })}
                    </tbody>
                </table>

            </div>
        )
    }
}




const mapStateToProps = (state) => {
    return {
        boxes: state.boxes,
    };
}

export default connect(mapStateToProps)(BoxList);
