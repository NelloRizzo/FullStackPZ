import { softwareModel } from "./softwareModel";

export interface licenseModel{
    id:number,
    software:softwareModel,
    life: number,
    price:number,
    type:string
}