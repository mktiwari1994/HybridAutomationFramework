import { Module, forwardRef } from "@nestjs/common";
import { AuthModule } from "../auth/auth.module";
import { ShippingModuleBase } from "./base/shipping.module.base";
import { ShippingService } from "./shipping.service";
import { ShippingController } from "./shipping.controller";
import { ShippingResolver } from "./shipping.resolver";

@Module({
  imports: [ShippingModuleBase, forwardRef(() => AuthModule)],
  controllers: [ShippingController],
  providers: [ShippingService, ShippingResolver],
  exports: [ShippingService],
})
export class ShippingModule {}
