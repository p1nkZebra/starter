import {MainComponent} from "@main/main.component";
import {RouterModule, Routes} from "@angular/router";
import {ModuleWithProviders} from "@angular/core";


export const ROUTES: Routes = [
    {path: '', redirectTo: 'main', pathMatch: 'full'},
    {path: 'main', component: MainComponent},

];

export const ROUTING: ModuleWithProviders = RouterModule.forRoot(ROUTES);
